package service;

import java.util.List;

public interface GeneralService<T> {

	List<T> read();

	int create(T t);

	int update(T t, int index);

	void delete(int index);

	String find(int ca_hoc, int thu_hoc);

}
