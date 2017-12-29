package com.cefothe.reactiveprograming;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.stream.Stream;

@SpringBootApplication

public class ReactiveProgramingApplication {


	@Bean
	ApplicationRunner runnerr(){
		return  args -> {
			Flux<String> flux = Flux.just("red", "white", "blue");

			Stream<String>  stream = Stream.of("red", "white", "blue");

			Stream<String> upperStream = stream.map(value -> {
				System.out.println(value);
				return value.toUpperCase();
			});

		};

	}


//	@Bean
//	ApplicationRunner runner(){
//		return args -> {
//			Flux<String> flux = Flux.just("red", "white", "blue");
//
//			Flux<String> upper = flux
//					.log()
//					.map(String::toUpperCase);
//
////				flux
////					.log()
////					.map(String::toUpperCase)
////					.subscribe();
//
////			flux.log().map(String::toUpperCase)
////					.subscribe(System.out::println);
//
////			Flux.just("red", "white", "blue")
////					.log()
////					.map(String::toUpperCase)
////					.subscribe(new Subscriber<String>() {
////						private long count = 0;
////						private Subscription subscription;
////
////						@Override
////						public void onSubscribe(Subscription subscription) {
////							this.subscription = subscription;
////							subscription.request(2);
////						}
////
////						@Override
////						public void onNext(String t) {
////							count++;
////							if (count>=2) {
////								count = 0;
////								subscription.request(2);
////							}
////						}
////
////						@Override
////						public void onError(Throwable t) {
////
////						}
////
////						@Override
////						public void onComplete() {
////
////						}
////					});
//
//
//			flux.log().map(String::toUpperCase)
//					.subscribeOn(Schedulers.parallel())
//					.subscribe(new Subscriber<String>() {
//						private long count = 0;
//						private Subscription subscription;
//
//						@Override
//						public void onSubscribe(Subscription subscription) {
//							this.subscription = subscription;
//							subscription.request(2);
//						}
//
//						@Override
//						public void onNext(String t) {
//							count++;
//							if (count>=2) {
//								count = 0;
//								subscription.request(2);
//							}
//						}
//
//						@Override
//						public void onError(Throwable t) {
//
//						}
//
//						@Override
//						public void onComplete() {
//
//						}
//					});
//
//			Stream<String>  stream = Stream.of("red", "white", "blue");
//
//			Stream<String> upperStream = stream.map(value -> {
//				System.out.println(value);
//				return value.toUpperCase();
//			});
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(ReactiveProgramingApplication.class, args);
	}
}
