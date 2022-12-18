package io.zipcoder.tc_spring_poll_application.repositories;

import io.zipcoder.tc_spring_poll_application.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
    Poll findOneById(Long pollId);

    void delete(Long pollId);

    boolean exists(Long pollId);
}
