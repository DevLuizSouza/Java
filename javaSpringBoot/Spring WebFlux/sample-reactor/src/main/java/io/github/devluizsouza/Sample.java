package io.github.devluizsouza;

import reactor.core.publisher.Mono;

public class Sample {
    public static void main(String[] args) {
        Mono.just(1)
                .doOnSuccess(System.out::println)
                .subscribe();

    }
}
