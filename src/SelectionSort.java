public class SelectionSort {
	
	/**
	 * Diese Methode sortiert ein int Array nach 
	 * dem Sortierverfahren: Selection Sort.
	 * @param liste Die unsortierte Liste
	 * @return Die sortierte Liste (aufsteigend)
	 */
	public static int[] selectionSort(int[] liste) {

		int listeLaenge = liste.length;
		for (int j = 0; j < listeLaenge; j++) {
			// findet das kleinste Element im Array
			int minIndex = j;
			for (int i = j; i < listeLaenge; i++) {
				if (liste[minIndex] > liste[i]) {
					minIndex = i;
				}
			}
			/* nach jedem Arraydurchlauf wird die kleinste Zahl
			 * durch das aktuelle Headelement ausgetauscht.
			 */
			int minZahl = liste[minIndex];
			liste[minIndex] = liste[j];
			liste[j] = minZahl;
		}
		return liste;
	}
}
