# 🌳 Generic Tree

Status of the 22 Generic Tree questions from the Prep Ledger.

> **Two copies of every question.** [`solution/`](solution) holds the worked answers (linked in the table below); [`practice/`](practice) holds fill-in-the-blank stubs — same signatures, a problem statement, and a `main` that self-grades with `Console.check` on run. Attempt from `practice/` first, peek at `solution/` only if stuck.

| ✅ Correct | ❌ Has a bug | ⏳ Not started |
|:---:|:---:|:---:|
| **9** | **4** | **9** |

> Every file runs on its own: open it and press ▶ next to `main`.
> Trees are read from [`input`](input) and [`input2`](input2) (line 1 = count, line 2 = values, `-1` = go back up).

---

## 📋 Questions

| # | Question | File | Status |
|:-:|---|---|:-:|
| 1 | Size | [`Q01_SizeOfGenericTree`](solution/Q01_SizeOfGenericTree.java) | ✅ |
| 2 | Max | [`Q02_MaxInGenericTree`](solution/Q02_MaxInGenericTree.java) | ✅ |
| 3 | Height | [`Q03_HeightOfGenericTree`](solution/Q03_HeightOfGenericTree.java) | ❌ [bug](#1-height--diameter) |
| 4 | Pre & Post order | [`Q04_PreAndPostOrderTraversal`](solution/Q04_PreAndPostOrderTraversal.java) | ✅ |
| 5 | Level order (BFS) | [`Q05_06_LevelOrderTraversal`](solution/Q05_06_LevelOrderTraversal.java) | ✅ |
| 6 | Level order linewise | same file | 🟡 linewise done · zigzag (LC 103) not done |
| 7 | Mirror | [`Q07_MirrorOfGenericTree`](solution/Q07_MirrorOfGenericTree.java) | ✅ |
| 8 | Remove leaves | [`Q08_RemoveLeaves`](solution/Q08_RemoveLeaves.java) | ✅ |
| 9 | Linearize | [`Q09_LinearizeGenericTree`](solution/Q09_LinearizeGenericTree.java) | ✅ [O(n²)](#3-linearize-works-but-slow) |
| 10 | Find | [`Q10_FindInGenericTree`](solution/Q10_FindInGenericTree.java) | ✅ |
| 11 | Node to Root path | [`Q11_NodeToRootPath`](solution/Q11_NodeToRootPath.java) | ✅ |
| 12 | Lowest Common Ancestor | [`Q12_LowestCommonAncestor`](solution/Q12_LowestCommonAncestor.java) | ❌ [bug](#2-lca--distance) |
| 13 | Distance between nodes | [`Q13_DistanceBetweenNodes`](solution/Q13_DistanceBetweenNodes.java) | ❌ [bug](#2-lca--distance) |
| 14 | Similar in shape | [`Q14_AreTreesSimilarInShape`](solution/Q14_AreTreesSimilarInShape.java) | ⏳ |
| 15 | Mirror in shape | [`Q15_AreTreesMirrorInShape`](solution/Q15_AreTreesMirrorInShape.java) | ⏳ |
| 16 | Multi Solver | [`Q16_MultiSolver`](solution/Q16_MultiSolver.java) | ⏳ |
| 17 | Predecessor & Successor | [`Q17_PredecessorAndSuccessor`](solution/Q17_PredecessorAndSuccessor.java) | ⏳ |
| 18 | Ceil & Floor | [`Q18_CeilAndFloor`](solution/Q18_CeilAndFloor.java) | ⏳ |
| 19 | Kth largest | [`Q19_KthLargestElement`](solution/Q19_KthLargestElement.java) | ⏳ |
| 20 | Diameter | [`Q20_DiameterOfGenericTree`](solution/Q20_DiameterOfGenericTree.java) | ❌ [uses buggy Height](#1-height--diameter) |
| 21 | Node with max subtree sum | [`Q21_NodeWithMaxSubtreeSum`](solution/Q21_NodeWithMaxSubtreeSum.java) | ⏳ |
| 22 | Iterative pre & post order | [`Q22_IterativePreAndPostOrder`](solution/Q22_IterativePreAndPostOrder.java) | ⏳ |

---

## 🐞 Bugs (confirmed with test trees)

### 1. Height → Diameter
`height += height(child)` **adds** the children's heights. Height is **1 + the tallest child**.

| Test tree | Expected | Got |
|---|:-:|:-:|
| Height | 3 | **4** |
| Diameter (uses Height) | 4 | **5** |

It looks right on `input` only because that tree is small.
> 💡 Keep a running `max` of child heights instead of a sum.

### 2. LCA & Distance
`ntr1.get(m) == ntr2.get(n)` compares `Integer` **objects**, not numbers. Java only reuses objects for −128…127, so it works with the sample values (10–120) and breaks above that.

| Tree with values 200–500 | Expected | Got |
|---|:-:|:-:|
| LCA(500, 400) | 200 | **crash** (`IndexOutOfBoundsException`) |
| Distance(500, 400) | 3 | **5** |

> 💡 Use `.equals(...)` or compare `int` values.

### 3. Linearize works, but slow
`getTail()` walks down each linearized child again. Interviewers often ask for the **O(n)** version.
> 💡 Make the recursion return the tail.

---

## 🔗 Ledger LeetCode links ≠ these questions

Some numbers in the ledger point to the **binary-tree cousin** of a question, not the generic-tree one here. They're good follow-ups, but solving one doesn't solve the other.

| Ledger link | What LeetCode actually asks |
|---|---|
| LC 101 | **Symmetric Tree**: is the tree its own mirror? |
| LC 1325 | Delete leaves **with a given value**, repeatedly |
| LC 257 | Print **all root-to-leaf paths** |
| LC 114 | Flatten a **binary** tree |

---

## 🎯 Suggested order

1. **Fix Height** → re-run **Diameter**
2. **Fix `==`** in **LCA** and **Distance**
3. **Warm-up:** 14 → 15 (shape comparisons)
4. **Build up:** 21 → 16 → 17 → 18 → 19. Multi Solver's "travel and change" style is reused in Pred/Succ, Ceil/Floor and Kth largest.
5. **Last:** 22 (iterative traversals with a stack)
