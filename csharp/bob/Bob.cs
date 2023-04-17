using System;
using System.Linq;
using System.Text.RegularExpressions;

public static class Bob
{
    public static string Response(string statement)
    {
        statement = statement.Trim();
        bool ehPergunta = statement.EndsWith('?');
        bool fraseTodaEmMaiusculo = statement.Equals(statement.ToUpper());
        bool temLetra = statement.Any(char.IsLetter);
        bool ehSilencio = string.IsNullOrWhiteSpace(statement);
        bool ehGrito = temLetra && fraseTodaEmMaiusculo;

        if (ehSilencio)
        {
            return "Fine. Be that way!";
        }

        if (ehGrito && ehPergunta)
        {
            return "Calm down, I know what I'm doing!";
        }

        if (ehPergunta)
        {
            return "Sure.";
        }

        if (ehGrito)
        {
            return "Whoa, chill out!";
        }

        return "Whatever.";
    }
}