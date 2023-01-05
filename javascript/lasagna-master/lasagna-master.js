/// <reference path="./global.d.ts" />
// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */

/**
 *
 * @param {number?} remainingTime time in minutes.
 * @returns {string} description
 */
export function cookingStatus(remainingTime) {
  if (remainingTime == 0) {
    return "Lasagna is done.";
  }

  if (Number(remainingTime)) {
    return "Not done, please wait.";
  }

  return "You forgot to set the timer.";
}

/**
 *
 * @param {string[]} layers Lasagna layers.
 * @param {number} average Average preparation time per layer in minutes
 * @returns {number} Estimation of preparation time.
 */
export function preparationTime(layers, average = 2) {
  return layers.length * average;
}

/**
 *
 * @param {string[]} layers Lasagna layers.
 * @returns {object}
 */
export function quantities(layers) {
  const sauceLayers = layers.filter((layer) => layer === "sauce");
  const noodleLayers = layers.filter((layer) => layer === "noodles");
  return {
    noodles: noodleLayers.length * 50,
    sauce: sauceLayers.length * 0.2,
  };
}

/**
 *
 * @param {string[]} friendIngredientList
 * @param {string[]} myIngredientList
 */
export function addSecretIngredient(friendIngredientList, myIngredientList) {
  const secretIngredient =
    friendIngredientList[friendIngredientList.length - 1];
  myIngredientList.push(secretIngredient);
}

/**
 *
 * @param {{noodles: number, sauce: number, mozzarella: number, meat: number} | {}} recipe Recipe for two portions.
 * @param {number} numberOfPortions
 */
export function scaleRecipe(recipe, numberOfPortions) {
    const scaledRecipe = {};
    const multiplier = numberOfPortions / 2;
    for (const key in recipe) {
        scaledRecipe[key] = multiplier * recipe[key];
    }
    return scaledRecipe;
}
