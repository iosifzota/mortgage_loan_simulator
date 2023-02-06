package com.daw.mortgage_loan_simulator.controller;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.daw.mortgage_loan_simulator.model.LoanOffer;
import com.daw.mortgage_loan_simulator.model.LoanRequest;
import com.daw.mortgage_loan_simulator.service.LoanOfferService;

import reactor.core.publisher.Flux;

@RestController
public class MainController {

    private final LoanOfferService service;

    public MainController(LoanOfferService service) {
        this.service = service;
    }

    @GetMapping(path = "/saved", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<LoanOffer> getSavedLoanOffers() {
        Flux<LoanOffer> f = Flux.fromIterable(service.getDao().all()).delayElements(Duration.ofSeconds(2));
        System.out.println("Called /saved");
        return f;
    }

    @PostMapping("/save")
    public void saveLoanOffers(@RequestBody LoanOffer offer) {
        System.out.println("Called /save");
        service.getDao().add(offer);
    }

    @PostMapping("/calculate")
    public void calculateLoanOffer(@RequestBody LoanRequest request) {
        System.out.println("Called /calculate");
        var val = request.getValue();
        var years = request.getDurationInYears();
        service.calculate(val, years);
    }

    @GetMapping("/last-calculated")
    public LoanOffer getLastCalculatedLoanOffer() {
        System.out.println("Called /calculate");
        return service.lastCalculated();
    }
}
