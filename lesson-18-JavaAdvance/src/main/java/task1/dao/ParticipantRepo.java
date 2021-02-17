package task1.dao;

import java.util.List;

import task1.domain.Participant;

public interface ParticipantRepo {
	
	public void create(Participant participant);

	public Participant readById(Integer id);

	public void update(Participant participant);

	public void delete(Integer id);

	public List<Participant> readAll();
}
