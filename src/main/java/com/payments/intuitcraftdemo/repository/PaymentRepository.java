package com.payments.intuitcraftdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.payments.intuitcraftdemo.model.PaymentDetails;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentDetails, Integer> {

}
