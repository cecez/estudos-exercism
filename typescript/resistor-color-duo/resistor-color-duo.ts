// 1. Use enum wherever applicable. This will be similar to -

enum Resistores {
  "black",
  "brown",
  "red",
  "orange",
  "yellow",
  "green",
  "blue",
  "violet",
  "grey",
  "white",
}

// Will be similar to: type BandColorType = "black" | "brown" | "red" | "orange"; 
type TipoResistores = keyof typeof Resistores

// When defining a function, it's always good to narrow down its arguments along with their types. Also add a return type for the function as well.
// Used array destructure to only take 2 values from arguments passed
export function decodedValue([primeiraCor, segundaCor]: TipoResistores[]): number {
  // To convert a string -> number, you could use Number(), parseInt() or just prepend '+' to the string
  return +`${Resistores[primeiraCor]}${Resistores[segundaCor]}`
}