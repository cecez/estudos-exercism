using System;

static class LogLine
{
    public static string Message(string logLine)
    {
        int levelIndex = logLine.IndexOf("]:") + 2;
        string subLog = logLine.Substring(levelIndex);
        return subLog.Trim();
    }

    public static string LogLevel(string logLine)
    {
        int beginIndex = logLine.IndexOf("[") + 1;
        int endIndex = logLine.IndexOf("]");
        string level = logLine.Substring(beginIndex, (endIndex-beginIndex));
        return level.ToLower();
    }

    public static string Reformat(string logLine)
    {
        string level = LogLevel(logLine);
        string message = Message(logLine);
        return $"{message} ({level})";
    }
}
