const oneEarthYearInSeconds = 31557600;

enum Planets {
  "mercury" = 0.2408467,
  "venus" = 0.61519726,
  "earth" = 1,
  "mars" = 1.8808158,
  "jupiter" = 11.862615,
  "saturn" = 29.447498,
  "uranus" = 84.016846,
  "neptune" = 164.79132
}

type PlanetsType = keyof typeof Planets

export function age(planet: PlanetsType, seconds: number): number {
  return Number((seconds / (oneEarthYearInSeconds * Planets[planet])).toFixed(2));
}
