package seat.reservation.controllers.seats;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 座席コントローラ
 */
@RestController
public class SeatController {
	
	/**
	 * 座席一覧を取得する
	 * 
	 * @return 座席一覧
	 */
	@GetMapping("/seats")
	public FindAllByResponse  findAllBy() {
		return new FindAllByResponse(List.of(new Seat(1)));
	}
}
