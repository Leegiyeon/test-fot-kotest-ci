package com.millo.ollim.admin

import io.sentry.Sentry
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SentryIntegrationTest {

    @Test
    fun `Sentry에 예외 전송 테스트`() {
        try {
            throw Exception("Sentry admin-api 테스트 예외입니다.")
        } catch (e: Exception) {
            Sentry.captureException(e)
        }
    }
}
