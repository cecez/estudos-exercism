enum BandColors {
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

type BandColorType = keyof typeof BandColors

export function decodedResistorValue([firstBand, secondBand, thirdBand]: BandColorType[]): string {
  
  const initialBandValue: number = +`${BandColors[firstBand]}${BandColors[secondBand]}`
  const multiplier: number = Math.pow(10, BandColors[thirdBand])
  let finalBandValue: number = initialBandValue * multiplier

  let prefix = ""
  if (finalBandValue >= 1000) {
    finalBandValue = finalBandValue / 1000
    prefix = "kilo"
  }

  return `${finalBandValue} ${prefix}ohms`
}