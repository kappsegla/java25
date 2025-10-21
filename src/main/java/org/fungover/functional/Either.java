package org.fungover.functional;

import static org.fungover.functional.Either.Left;
import static org.fungover.functional.Either.Right;

public sealed interface Either<L, R> permits Left, Right {

    public record Left<L, R>(L left) implements Either<L, R> {
    }

    public record Right<L, R>(R right) implements Either<L, R> {
    }
}
