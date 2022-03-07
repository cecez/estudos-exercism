export function isLeap(year: number): boolean {
  var data = new Date(year, 1, 28);
  data.setDate(data.getDate() + 1);
  return data.getDate() === 29;
}
