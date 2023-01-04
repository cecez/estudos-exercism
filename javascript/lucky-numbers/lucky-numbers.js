// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  const firstNumber = Number(array1.join(''));
  const secondNumber = Number(array2.join(''));
  return firstNumber + secondNumber;
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export function luckyNumber(value) {
  // original number -> string -> array -> reverse -> string -> reversed number
  const stringValue = String(value);
  const arrayString = [...stringValue];
  const reversedArray = arrayString.reverse();
  const stringArray = reversedArray.join('');
  const reverseNumber = Number(stringArray);
  return value === reverseNumber;
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  const withoutInput = !input;
  if (withoutInput) {
    return 'Required field';
  }

  const validNumber = Number(input);
  if (validNumber) {
    return '';
  }

  return 'Must be a number besides 0';
}
