let DAY_HOURS = 8
let MONTHLY_DAYS = 22

func dailyRateFrom(hourlyRate: Int) -> Double {
  return Double(hourlyRate) * Double(DAY_HOURS)
}

func monthlyRateFrom(hourlyRate: Int, withDiscount discount: Double) -> Double {
  return Double(dailyRateFrom(hourlyRate: hourlyRate) * Double(MONTHLY_DAYS) * ((100.0 - discount) / 100.0)).rounded()
}

func workdaysIn(budget: Double, hourlyRate: Int, withDiscount discount: Double) -> Double {
  return Double(Int((22.0 * Double(budget)) / monthlyRateFrom(hourlyRate: hourlyRate, withDiscount: discount)))
}
