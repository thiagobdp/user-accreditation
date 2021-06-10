package br.com.investoraccreditation.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.investoraccreditation.controller.dto.PayloadDto;
import br.com.investoraccreditation.model.Payload;
import br.com.investoraccreditation.repository.DocumentRepository;
import br.com.investoraccreditation.repository.PayloadRepository;
import br.com.investoraccreditation.repository.UserAccreditationRepository;

@RestController
@RequestMapping("/payload")
public class PayloadController {

	@Autowired
	UserAccreditationRepository userAccreditationRepository;

	@Autowired
	PayloadRepository payloadRepository;

	@Autowired
	DocumentRepository documentRepository;

	@Transactional
	@GetMapping
	public List<PayloadDto> payload() {

		List<Payload> payloadLst = payloadRepository.findAll();

		return payloadLst.stream().map(p -> new PayloadDto(p)).collect(Collectors.toList());
	}

}
