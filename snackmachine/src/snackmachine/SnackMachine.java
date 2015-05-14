/**
 * 
 */
package snackmachine;

/**
 * @author sparrow
 *
 */
public class SnackMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			switch (args[i]) {

			case "-h":
				System.out.println(getHelp());
				break;
			case "-v":
				System.out.println(getVersion());
				break;
			case "-makeCoffe":
				Coffee coffe = new Coffee();

				if ((i + 1) >= args.length)
					break;
				try {
					System.out.println("We made "
							+ coffe.make(Integer.parseInt(args[i + 1]))
							+ " cups of coffe");
					i++;
				} catch (Exception ex) {
					System.out.println("We made " + coffe.make()
							+ " cup of coffe");
				}
				break;

			case "-makeToast":
				Toast toast = new Toast();

				if ((i + 1) >= args.length)
					break;

				try {

					System.out.println("We made "
							+ toast.make(Integer.parseInt(args[i + 1]))
							+ " tosts");
					i++;
				} catch (Exception ex) {
					System.out.println("We made " + toast.make() + " toast");
				}

				break;

			default:
				System.out.println("Incorrect parameter: " + args[i]);
			}

		}

	}

	public static String getVersion() {
		return "Version 1.1";
	}

	public static String getHelp() {
		return "Allowed commands:\n-v - version\n-h - help\n"
				+ "-makeCoffe <n> - makes n coffee\n"
				+ "-makeToast <n> - Makes n toasts";
	}

}