package com.momo.board;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.momo.domain.Board;
import com.momo.domain.Place;

public interface MyRepository extends CrudRepository<Place, Long>{
	List<Place> findByBoard(Board board);
}
