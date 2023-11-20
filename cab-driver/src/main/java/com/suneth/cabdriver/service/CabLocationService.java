package com.suneth.cabdriver.service;

import com.suneth.cabdriver.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(Constants.CAB_LOCATION, location);
        return true;
    }
}
