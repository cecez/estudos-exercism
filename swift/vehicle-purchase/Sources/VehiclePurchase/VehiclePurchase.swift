func canIBuy(vehicle: String, price: Double, monthlyBudget: Double) -> String {
  if (monthlyBudget * 5 * 12) >= price {
    return "Yes! I'm getting a \(vehicle)"
  }

  let monthlyPayment: Double = price / (5 * 12)
  let monthlyBudgetPlus10Percent: Double = monthlyBudget * 1.1
  if (monthlyPayment < monthlyBudgetPlus10Percent) {
    return "I'll have to be frugal if I want a \(vehicle)"
  }

  return "Darn! No \(vehicle) for me"
}

func licenseType(numberOfWheels wheels: Int) -> String {
  guard (wheels > 0 && wheels <= 18) else {
    return "We do not issue licenses for those types of vehicles"
  }

  if (wheels <= 3) {
    return "You will need a motorcycle license for your vehicle"
  } else if (wheels <= 6) {
    return "You will need an automobile license for your vehicle"
  } else {
    return "You will need a commercial trucking license for your vehicle"
  }
}

func registrationFee(msrp: Int, yearsOld: Int) -> Int {
  if (yearsOld >= 10) {
    return 25
  }

  let baseCost: Int = (msrp > 25_000) ? msrp : 25_000; 
  let baseCostIntermediate: Double = Double(baseCost) - (Double(baseCost) * 0.1 * Double(yearsOld))
  let registrationFee: Int = Int(baseCostIntermediate / 100)

  return registrationFee
}
