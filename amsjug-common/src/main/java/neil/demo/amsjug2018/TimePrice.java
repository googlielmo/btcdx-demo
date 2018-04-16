package neil.demo.amsjug2018;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>Represents a price at a particular point in time.
 * </p>
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimePrice implements Serializable {

	private Date date;
	private BigDecimal rate;

	/**
	 * <p>Convenience constructor if passed a {@link java.time.LocalDate}
	 * </p>
	 * 
	 * @param localDate
	 * @param rate
	 */
	public TimePrice(LocalDate localDate, BigDecimal rate) {
		this.date = TimePrice.convert(localDate);
		this.rate = rate;
	}
	
	/**
	 * <p>For windowing, more convenient to have the date as a
	 * number.
	 * </p>
	 * 
	 * @return
	 */
	public long getTimestamp() {
		return this.getDate().getTime();
	}
	
	/**
	 * <p>Convenience method to turn a {@link java.time.LocalDate LocalDate}
	 * into {@link java.util.Date Date}.
	 * </p>
	 * 
	 * @param day
	 * @return
	 */
	public static Date convert(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}

}
