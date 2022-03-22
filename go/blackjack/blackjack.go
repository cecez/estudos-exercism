package blackjack

// ParseCard returns the integer value of a card following blackjack ruleset.
func ParseCard(card string) int {
	switch card {
	case "ace":
		return 11
	case "two":
		return 2
	case "three":
		return 3
	case "four":
		return 4
	case "five":
		return 5
	case "six":
		return 6
	case "seven":
		return 7
	case "eight":
		return 8
	case "nine":
		return 9
	case "ten", "jack", "queen", "king":
		return 10
	}
	return 0
}

func FirstTurn(card1, card2, dealerCard string) string {

	handScore := ParseCard(card1) + ParseCard(card2)
	isBlackJack := IsBlackjack(card1, card2)
	dealerScore := ParseCard(dealerCard)

	if handScore > 20 {
		return LargeHand(isBlackJack, dealerScore)
	}
	return SmallHand(handScore, dealerScore)
}

// IsBlackjack returns true if the player has a blackjack, false otherwise.
func IsBlackjack(card1, card2 string) bool {
	cardValue1, cardValue2 := ParseCard(card1), ParseCard(card2)
	return cardValue1+cardValue2 == 21
}

// LargeHand implements the decision tree for hand scores larger than 20 points.
func LargeHand(isBlackjack bool, dealerScore int) string {
	switch {
	case !isBlackjack:
		return "P"
	case dealerScore != 11 && dealerScore != 10:
		return "W"
	}
	return "S"
}

// SmallHand implements the decision tree for hand scores with less than 21 points.
func SmallHand(handScore, dealerScore int) string {
	switch {
	case handScore >= 17:
		return "S"
	case handScore <= 11, dealerScore >= 7:
		return "H"
	}
	return "S"
}
