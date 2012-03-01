package jollycheck

import de.jollyday.Holiday
import de.jollyday.HolidayCalendar
import de.jollyday.HolidayManager

class HoliController {

	def index() {

		HolidayManager hm = HolidayManager.getInstance(HolidayCalendar.GERMANY)

		List<Holiday> holidayList = hm.getHolidays(2012, 'he').sort({it.date})

		render holidayList
	}
}
