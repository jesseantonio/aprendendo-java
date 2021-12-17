package com.godev.acamparbackend.services.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.godev.acamparbackend.domain.Camping;
import com.godev.acamparbackend.dto.CampingDTO;
import com.godev.acamparbackend.repositories.CampingRepository;
import com.godev.acamparbackend.resources.exceptions.FieldMessage;

public class CampingValidator implements ConstraintValidator<CampingValidatorAnnotation, CampingDTO> {

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private CampingRepository campingRepository;

	@Override
	public void initialize(CampingValidatorAnnotation constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(CampingDTO campingDto, ConstraintValidatorContext context) {

		List<FieldMessage> list = new ArrayList<>();

		Camping camping = campingRepository.findByEmail(campingDto.getEmail());
		if (camping != null) {
			list.add(new FieldMessage("email", "Email já existente"));
		}

		if (request.getMethod().equals("PUT")) {
			@SuppressWarnings("unchecked")
			Map<String, String> map = (Map<String, String>) request
					.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
			Integer campingId = Integer.parseInt(map.get("id"));

			if (!camping.getId().equals(campingId)) {
				list.add(new FieldMessage("email", "Email já existente"));
			}

		}

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();

		}
		return list.isEmpty();
	}

}
