interface dnaReplacement {
  [index: string]: string
}

export function toRna(dna: string): string {
  if (isInvalidDna(dna)) {
    throw new Error("Invalid input DNA.");
  } 
  
  const replacement: dnaReplacement = {"A":"U", "C":"G", "G": "C", "T": "A"};
  return dna.replace(/[ACTG]/g, m => replacement[m]);
}

function isInvalidDna(dna: string): boolean {
  const regex = /^[ACTG]+$/gm;
  return !regex.test(dna);
}
