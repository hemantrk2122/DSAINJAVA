package t00_common;

// Colourful console output shared by every question (ANSI colours: IntelliJ's Run window and macOS Terminal support them).
public final class Console {
	public static final String RESET   = "\u001B[0m";
	public static final String BOLD    = "\u001B[1m";
	public static final String RED     = "\u001B[31m";
	public static final String GREEN   = "\u001B[32m";
	public static final String YELLOW  = "\u001B[33m";
	public static final String MAGENTA = "\u001B[35m";
	public static final String CYAN    = "\u001B[36m";
	public static final String GREY    = "\u001B[90m";

	// Colour for everything a solution prints with System.out.
	public static final String OUTPUT  = CYAN;
	// Use after coloured text to go back to the output colour.
	public static final String RESTORE = RESET + OUTPUT;

	private Console() {}

	// Banner with the question title; switches the rest of the output to the output colour.
	public static void header(String title) {
		String bar = "─".repeat(title.length() + 4);
		System.out.println(MAGENTA + "╭" + bar + "╮");
		System.out.println("│  " + BOLD + title + RESET + MAGENTA + "  │");
		System.out.println("╰" + bar + "╯" + RESET);
		System.out.print(OUTPUT);
		Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.print(RESET)));
	}

	// Sub-heading inside one run, e.g. "Mirror of a GT".
	public static void section(String text) {
		System.out.println();
		System.out.println(YELLOW + BOLD + "▸ " + text + RESTORE);
	}

	// "label: value" with the value highlighted.
	public static void result(String label, Object value) {
		System.out.println(GREY + label + ": " + RESET + BOLD + GREEN + value + RESTORE);
	}

	// Compares an answer with the expected one and marks it ✔ or ✘.
	public static void check(String label, Object actual, Object expected) {
		boolean ok = String.valueOf(actual).equals(String.valueOf(expected));
		String mark = ok ? GREEN + BOLD + "✔ " : RED + BOLD + "✘ ";
		String tail = ok ? "" : GREY + "  (expected " + expected + ")";
		System.out.println(mark + RESET + GREY + label + ": " + RESET + BOLD + (ok ? GREEN : RED) + actual + RESET + tail + RESTORE);
	}

	// Reminder for questions that aren't solved yet.
	public static void todo(String text) {
		System.out.println(YELLOW + BOLD + "TODO " + RESET + YELLOW + text + RESTORE);
	}
}
