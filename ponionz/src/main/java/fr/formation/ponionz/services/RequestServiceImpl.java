package fr.formation.ponionz.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import fr.formation.ponionz.domain.dtos.RequestCreate;
import fr.formation.ponionz.domain.dtos.RequestView;
import fr.formation.ponionz.domain.entities.Request;
import fr.formation.ponionz.repositories.RequestRepository;

@Service
public class RequestServiceImpl implements RequestService {

	private final RequestRepository repository;

	public RequestServiceImpl(RequestRepository repository) {
		this.repository = repository;

	}

	@Override
	public void create(RequestCreate dto) {
		Request request = new Request();
		request.setAmount(dto.getAmount());
		request.setContribution(dto.getContribution());
		request.setDuration(dto.getDuration());
		request.setInsuranceRate(dto.getInsuranceRate());
		request.setInterestRate(dto.getInterestRate());
		request.setJobLossInsurance(dto.isJobLossInsurance());
		request.setDate(LocalDate.now());
		repository.save(request);

	}

	@Override
	public RequestView getById(Long id) {
		Request request = repository.findById(id).get();
		RequestView view = new RequestView();
		view.setAmount(request.getAmount());
		view.setContribution(request.getContribution());
		view.setDuration(request.getDuration());
		view.setInsuranceRate(request.getInsuranceRate());
		view.setInterestRate(request.getInterestRate());
		view.setJobLossInsurance(request.isJobLossInsurance());

		return view;
	}

}
