/*
 * MIT License
 *
 * Copyright (c) 2021 kokodyn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.jantarcode.puzzles.reactor.from_stream;

import com.jantarcode.puzzles.common.FluxTask;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Stream can not be reused.
 * For details please look at {@link Flux#fromStream(Stream)} and {@link Flux#defer(Supplier)}
 */
class FromStreamSolution implements FluxTask<String> {
    @Override
    public Flux<String> get() {
        return Flux.defer(() -> Flux.fromStream(Stream.of("a", "b", "c")));
    }
}
