export function decodedValue(resistores: string[]): number {

  const primeiraResistencia: number = decodificaCor(resistores[0])
  const segundaResistencia: number = decodificaCor(resistores[1])

  return parseInt(`${primeiraResistencia}${segundaResistencia}`)
}

function decodificaCor(cor: string): number {
  switch (cor) {
    case "black": return 0
    case "brown": return 1
    case "red": return 2
    case "orange": return 3
    case "yellow": return 4
    case "green": return 5
    case "blue": return 6
    case "violet": return 7
    case "grey": return 8
    case "white": return 9
  }

  return -1
}
