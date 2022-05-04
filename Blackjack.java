public class Blackjack {

    public int parseCard(String card) {

        if (card == "ten" || card == "jack" || card == "queen" || card == "king") {
            return 10;
        } else {
            switch (card) {
                case "ace": {
                    return 11;
                }
                case "nine": {
                    return 9;
                }
                case "eight": {
                    return 8;
                }
                case "seven": {
                    return 7;
                }
                case "six": {
                    return 6;
                }
                case "five": {
                    return 5;
                }
                case "four": {
                    return 4;
                }
                case "three": {
                    return 3;
                }
                case "two": {
                    return 2;
                }
                case "one": {
                    return 1;
                }
                default: {
                    return 0;

                }
            }
        }
        // throw new UnsupportedOperationException("Please implement the
        // Blackjack.parseCard method");
    }

    public boolean isBlackjack(String card1, String card2) {

        int cardOne = parseCard(card1);
        int cardTwo = parseCard(card2);

        int cardsValue = (cardOne + cardTwo);
        if (cardsValue == 21) {
            return true;
        } else {
            return false;
        }

        // throw new UnsupportedOperationException("Please implement the
        // Blackjack.isBlackjack method");
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

        if (isBlackjack && dealerScore >= 10) {
            return "S"; // Stand
        } else if (isBlackjack && dealerScore < 10) {
            return "W"; // Automatically Win
        } else {
            return "P"; // Split
        }

        // throw new UnsupportedOperationException("Please implement the
        // Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {

        if (handScore <= 11) {
            return "H"; // Hit
        } else if (handScore >= 12 && handScore <= 16 && dealerScore < 7) {
            return "S"; // Stand
        } else if (handScore >= 12 && handScore <= 16 && dealerScore >= 7) {
            return "H";
        } else {
            return "S"; // Stand
        }

        // throw new UnsupportedOperationException("Please implement the
        // Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the
    // cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls
    // the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}