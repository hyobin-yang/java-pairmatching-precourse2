package pairmatching.handler;

import java.util.function.Supplier;

public class RetryHandler {
    public static <T> T retryUntilSuccessWithReturn(Supplier<T> inputSupplier) {
        while (true) {
            try {
                return inputSupplier.get();
            } catch (IllegalArgumentException e) {
                ErrorHandler.handle(e);
            }
        }
    }

    public static void retryUntilSuccessWithoutReturn(Runnable task) {
        while (true) {
            try {
                task.run();
                return;
            } catch (IllegalArgumentException e) {
                ErrorHandler.handle(e);
            }
        }
    }
}
