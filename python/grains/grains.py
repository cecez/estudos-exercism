def square(number):
    """
    Calculate the number of grains on a given square.
    :param number: square
    :return: number
    """
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64")
    return pow(2, number - 1)


def total():
    """
    Calculate the total number of grains on the chessboard. (64 squares)
    :return: number
    """
    return pow(2, 64) - 1
