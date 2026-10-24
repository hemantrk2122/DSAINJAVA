package t05_genericTree.solution;

import t00_common.Console;

// 20. Diameter of a Generic Tree
public class Q20_DiameterOfGenericTree {

	public static int getDiameter(Node root) {
		int mh = -1;
		int smh = -1;
		int dia = -1;
		for(Node node:root.children) {
			int h = Q03_HeightOfGenericTree.height(node);
			if(h>mh) {
				smh = mh;
				mh = h;
			}else if(h>smh) {
				smh = h;
			}
		}
		dia = mh+smh+2;
		for(Node node:root.children) {
			dia = Math.max(dia, getDiameter(node));
		}
		return dia;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 20. Diameter of a Generic Tree");
		Node root = GenericTreeUtils.build("input2");
		Console.result("Diameter of a Generic Tree", getDiameter(root));
	}
}
