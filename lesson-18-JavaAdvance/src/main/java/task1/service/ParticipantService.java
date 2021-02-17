package task1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import task1.dao.ParticipantRepo;
import task1.domain.Participant;

@Service
public class ParticipantService {
	@Autowired
	ParticipantRepo participantRepo;

	public void create(Participant participant) {
		participantRepo.create(participant);
	}

	public Participant readById(Integer id) {
		return participantRepo.readById(id);
	}

	public void update(Participant participant) {
		participantRepo.update(participant);
	}

	public void delete(Integer id) {
		participantRepo.delete(id);
	}

	public List<Participant> readAll() {
		return participantRepo.readAll();
	}
}
