package seat.reservation.controllers.seats;

import java.util.List;

/**
 * findAllByレスポンス
 * 
 * @param seats 座席一覧
 *
 */
public record FindAllByResponse(List<Seat> seats) {
}
