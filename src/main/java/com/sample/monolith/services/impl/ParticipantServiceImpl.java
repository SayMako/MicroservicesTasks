package com.sample.monolith.services.impl;

import com.sample.monolith.models.Participant;
import com.sample.monolith.repositories.ParticipantRepository;
import com.sample.monolith.services.ParticipantService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantServiceImpl implements ParticipantService, InitializingBean {
    private static final Long STUB_PARTICIPANT_ID = 123L;

    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        // SAMPLE CUSTOMER
        participantRepository.save(new Participant(STUB_PARTICIPANT_ID, "FirstName", "SecondName", "some_url"));
    }

    @Override
    public Participant getCurrentParticipant() {
        // STUBBED CALL
        return participantRepository.findById(STUB_PARTICIPANT_ID).orElseThrow(() ->
                new RuntimeException("Cannot find current customer"));
    }
}
