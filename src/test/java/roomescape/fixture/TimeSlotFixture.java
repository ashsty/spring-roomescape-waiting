package roomescape.fixture;

import org.springframework.stereotype.Component;
import roomescape.domain.TimeSlot;

import java.time.LocalTime;

@Component
public class TimeSlotFixture {

    public static TimeSlot TIME_ONE = new TimeSlot(1L, LocalTime.of(10, 0));

    public static TimeSlot TIME_TWO = new TimeSlot(2L, LocalTime.of(11, 0));
}