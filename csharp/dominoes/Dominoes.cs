using System;
using System.Collections.Generic;
using System.Linq;

public static class Dominoes
{
    public static bool CanChain(IEnumerable<(int, int)> dominoes)
    {
        var domList = dominoes.ToList();
        
        // Empty list is valid
        if (!domList.Any())
            return true;
            
        // Single domino is only valid if both numbers match
        if (domList.Count == 1)
            return domList[0].Item1 == domList[0].Item2;
            
        // Try each domino as the starting piece
        for (int i = 0; i < domList.Count; i++)
        {
            var remaining = domList.ToList();
            var first = remaining[i];
            remaining.RemoveAt(i);
            
            // Try both orientations of the first domino
            if (TryChain(first.Item1, first.Item2, remaining) || 
                TryChain(first.Item2, first.Item1, remaining))
                return true;
        }
        
        return false;
    }
    
    private static bool TryChain(int firstNum, int lastNum, List<(int, int)> remaining)
    {
        // If no dominoes left, check if chain is valid (first matches last)
        if (!remaining.Any())
            return firstNum == lastNum;
            
        // Try each remaining domino
        for (int i = 0; i < remaining.Count; i++)
        {
            var current = remaining[i];
            var newRemaining = remaining.ToList();
            newRemaining.RemoveAt(i);
            
            // Try connecting current domino in both orientations
            if (current.Item1 == lastNum && 
                TryChain(firstNum, current.Item2, newRemaining))
                return true;
                
            if (current.Item2 == lastNum && 
                TryChain(firstNum, current.Item1, newRemaining))
                return true;
        }
        
        return false;
    }
} 