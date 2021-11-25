package com.jantarcode.puzzles.reactor.repeat;

import com.jantarcode.puzzles.annotations.Solution;
import com.jantarcode.puzzles.annotations.Task;
import com.jantarcode.puzzles.common.FluxSupplier;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

class RepeatTaskTest {

    @Test
    @Solution
    void solution() {
        test(new RepeatSolution());
    }

    @Test
    @Task
    void task() {
        test(new RepeatTask());
    }

    <T extends FluxSupplier<Integer>> void test(T publisher) {
        StepVerifier.create(publisher.get()).expectNextCount(22).verifyComplete();
    }

}