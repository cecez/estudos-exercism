export function isPangram(sentence: string): boolean {
  // const alphabet = 'abcdefghijklmnopqrstuvwxyz'
  // const letters = sentence.toLowerCase().split('')
  // return alphabet.split('').every(letter => letters.includes(letter))

  const alphabet = "abcdefghijklmnopqrstuvwxyz"
  const sentenceLetters = sentence.toLowerCase().replace(/[^a-z]+/g, "").split("").sort()
  const uniqueLetters = [...new Set(sentenceLetters)].join("")

  return alphabet === uniqueLetters
}
