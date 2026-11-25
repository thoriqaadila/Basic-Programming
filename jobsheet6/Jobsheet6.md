# Practical Report: Jobsheet 6

**Case Study: Selection Structures with Git and GitHub**
Fundamentals of Programming 2026, Politeknik Negeri Malang

| | |
|---|---|
| Name | M. Thoriq Aadila D. |
| Student ID (NIM) | 264107020035 |
| Class | 1I |
| Attendance Number (NoPresensi) | 19 |
| GitHub Username | thoriqaadila |


---

## 1. Learning Objectives

1. Solve case studies with basic and nested selection structures.
2. Save and submit work with Git and GitHub through Visual Studio Code (VS Code).
3. Collaborate with a classmate through GitHub.

## 2. Tools

| Tool | Version | Purpose |
|---|---|---|
| Visual Studio Code | ...... | Writing and running Java, running Git actions |
| Git | ...... | Version control |
| GitHub | - | Remote repository and collaboration |
| JDK | ...... | Compiling and running Java |

---

## 3. Initial Setup

*Done once on each laptop/PC. Duration: 20 minutes.*

### 3.1 Steps

1. I created a GitHub account at https://github.com and verified it by email.
2. I installed Git from https://git-scm.com/downloads with the default settings. The default settings include Git Credential Manager, so I did not need a token.
3. I restarted VS Code so it could detect Git.
4. I opened **Terminal → New Terminal** in VS Code.
5. I set my Git identity with these two commands:

```bash
git config --global user.name "your-github-username"
git config --global user.email "your-email@example.com"
```

No message appeared after I pressed Enter, so the setup succeeded.

---

## 4. Experiment 1: Setting Up a Repository

*Duration: 35 minutes.*

### 4.1 Steps

1. On GitHub, I clicked **+ → New repository**. I named it `PraktikumDaspro<NoPresensi>`, set the visibility to **Public**, left **Add README** off, and clicked **Create repository**.
2. On the **Quick setup** page, I selected **HTTPS** and copied the repository URL.
3. In VS Code, I clicked **Clone Git Repository...** on the Welcome page, pasted the URL, and chose **Clone from URL**.
4. I picked the destination folder, clicked **Select as Repository Destination**, then **Open**. I clicked **Yes, I trust the authors** when VS Code asked.
5. I created `README.md` with the **New File** icon and wrote my identity in it, then saved with Ctrl+S. VS Code marked the file **U (Untracked)**.
6. In **Source Control**, I clicked the **+** icon (Stage Changes) next to `README.md`. The status changed to **A (Added)**.
7. I wrote the commit message `Added identity information to README` and clicked **Commit**. The commit saved a new version in my local repository.
8. I clicked **... → Push** (or **Publish Branch**) to send the commit to GitHub. I signed in through the browser on the first push.
9. I refreshed the repository page on GitHub and confirmed that `README.md` appeared.

### 4.2 `README.md` Content

```markdown
Ini adalah repository pertama saya
Nama  : ......
NIM   : ......
Kelas : ......
```

### 4.3 Problems Found

No problems found. *(If you got an error, replace this line. Example: Push failed with error 403 because another GitHub account was saved on the lab computer. I removed `git:https://github.com` under Windows Credentials in Credential Manager, then pushed again.)*

---

## 5. Experiment 2: Case Study 1 (Basic Selection)

*Duration: 45 minutes. File: `StudiKasus1XX.java`.*

### 5.1 Problem

Kedai Kopi Senja sells Kopi Susu Gula Aren at Rp18,000 per cup. A purchase of at least Rp100,000 gets a 10% discount. The program calculates the total payment and the change.

### 5.2 Flowchart Analysis

**Variables**

| Variable | Type | Value / Role |
|---|---|---|
| `hargaPerCup` | `int` | 18000 (fixed price per cup) |
| `jumlahCup` | `int` | Input: number of cups |
| `uangBayar` | `int` | Input: money paid |
| `totalHarga` | `int` | `jumlahCup × hargaPerCup` |
| `diskon` | `int` | 0 by default, 10% of `totalHarga` if the condition holds |
| `totalBayar` | `int` | `totalHarga − diskon` |
| `kembalian` | `int` | `uangBayar − totalBayar` when the money is enough |
| `kurang` | `int` | `totalBayar − uangBayar` when the money is not enough |

**Logic**

| Step | Condition | If Yes | If No |
|---|---|---|---|
| 1 | `totalHarga >= 100000` | `diskon = totalHarga * 10 / 100` | `diskon` stays 0 |
| 2 | `uangBayar >= totalBayar` | Print `kembalian` | Print "Uang tidak cukup, kurang Rp" and `kurang` |

### 5.3 Source Code

```java
import java.util.Scanner;

public class StudiKasus1XX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input
        System.out.print("Masukkan jumlah cup  : ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar  : ");
        uangBayar = input.nextInt();

        // Calculate total price and discount
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;

        // Output price details
        System.out.println("Total harga          : Rp " + totalHarga);
        System.out.println("Diskon               : Rp " + diskon);
        System.out.println("Total bayar          : Rp " + totalBayar);

        // Check the money paid
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian            : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        input.close();
    }
}
```

**Code explanation**

- The program reads `jumlahCup` and `uangBayar` with `Scanner`.
- It sets `diskon` to 0, then changes it to 10% of `totalHarga` only when `totalHarga >= 100000`.
- It subtracts the discount to get `totalBayar`.
- A second `if-else` compares `uangBayar` with `totalBayar`. Enough money prints the change. Not enough money prints the shortage.

### 5.4 Output

I ran the program with the jobsheet example (3 cups, Rp50,000 paid):

```text
Masukkan jumlah cup  : 3
Masukkan uang bayar  : 50000
Total harga          : Rp 54000
Diskon               : Rp 0
Total bayar          : Rp 54000
Uang tidak cukup, kurang Rp 4000
```

**Test runs**

| No | Cups | Money Paid | Total Price | Discount | Total Payment | Output |
|---|---|---|---|---|---|---|
| 1 | 3 | 50000 | 54000 | 0 | 54000 | Short by Rp 4000 |
| 2 | 5 | 100000 | 90000 | 0 | 90000 | Change Rp 10000 |
| 3 | 6 | 100000 | 108000 | 10800 | 97200 | Change Rp 2800 |
| 4 | 1 | 20000 | 18000 | 0 | 18000 | Change Rp 2000 |

Test 2 stays below Rp100,000, so there is no discount. Test 3 reaches Rp108,000, so the 10% discount applies.

### 5.5 Git Record

| Commit | Message | Content |
|---|---|---|
| 1 | `SK1: input and variable declaration` | Variables and input |
| 2 | `SK1: discount and change logic` | Discount and change logic |

### 5.6 Analysis

The first `if` decides the discount. It checks `totalHarga >= 100000`. A total of Rp90,000 gets no discount, and a total of Rp108,000 gets Rp10,800 off. The second `if-else` decides between two results: change when `uangBayar >= totalBayar`, and shortage otherwise. Both branches use the discounted `totalBayar`, so the discount affects the change too.

---

## 6. Experiment 3: Case Study 2 (Nested Selection)

*Duration: 60 minutes. File: `StudiKasus2XX.java`.*

### 6.1 Problem

The Student Affairs Division of Politeknik Negeri Malang issued a letter about verifying achievement documents for Activity Year 2026, Stage I. The program checks the award fund status of a student.

**Award rules**

| Activity Type | Condition for Award Funds |
|---|---|
| BELMAWA, BAKORMA, Mandiri (competition) | Rank 1, 2, or 3. Honorable Mention and regular participants get nothing. |
| PKM | Proposal approved for funding. |
| Lainnya (Other) | No award funds. |

**Document rule:** a student who meets the competition or PKM condition must upload 4 documents to SIAKAD (Assignment Letter, Certificate, Activity Photo, Activity Poster). With fewer than 4 documents, the data is incomplete and no funds are given. The output states how many documents are missing.

**Program constraints:** nested IF with a maximum depth of 3 levels. The program asks only for the data needed by the activity type.

### 6.2 Input Data

| Data | Requirement | Asked When |
|---|---|---|
| Student name | Text | Always |
| Type of activity | BELMAWA, BAKORMA, Mandiri, PKM, or Lainnya (not case-sensitive) | Always |
| Number of documents uploaded | Number, 0 to 4 | Competition and PKM |
| Competition rank | 1, 2, or 3; 0 if not a winner | Competition only |
| PKM funding status | 1 = approved, 0 = not approved | PKM only |

### 6.3 Decision Structure

| Level 1 | Level 2 | Level 3 | Result |
|---|---|---|---|
| Competition | Rank is 1, 2, or 3 | Documents = 4 | Eligible |
| | | Documents < 4 | Incomplete, show missing count |
| | Rank is 0 | - | Not eligible (winners only) |
| PKM | Funding = 1 | Documents = 4 | Eligible |
| | | Documents < 4 | Incomplete, show missing count |
| | Funding = 0 | - | Not eligible (proposal not approved) |
| Other | - | - | Not eligible (type not covered) |

The deepest path is competition → rank check → document check. That makes 3 levels.

### 6.4 Source Code

```java
import java.util.Scanner;

public class StudiKasus2XX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkat, statusPkm;

        System.out.print("Nama mahasiswa : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = input.nextLine().trim().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            // Competition branch
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak menerima dana penghargaan (juara " + peringkat + " dan 4 dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak berhak menerima dana penghargaan (hanya untuk juara 1, 2, atau 3).");
            }

        } else if (jenis.equals("PKM")) {
            // PKM branch
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = disetujui, 0 = tidak) : ");
            statusPkm = input.nextInt();

            if (statusPkm == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Berhak menerima dana penghargaan (proposal PKM disetujui didanai dan 4 dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak berhak menerima dana penghargaan (proposal PKM tidak disetujui didanai).");
            }

        } else {
            // Other branch
            System.out.println("Status : Tidak berhak menerima dana penghargaan (jenis kegiatan tidak termasuk dalam ketentuan).");
        }

        input.close();
    }
}
```

**Code explanation**

- `toUpperCase()` turns the activity type into capital letters, so `bakorma`, `Bakorma`, and `BAKORMA` all match.
- The outer `if` / `else if` / `else` splits the three activity groups: competition, PKM, and other.
- Competition and PKM ask for the number of documents first. Only competition asks for the rank, and only PKM asks for the funding status.
- The "Other" branch asks for nothing else and prints the result right away.
- The missing document count is `4 - jumlahDokumen`.

### 6.5 Output

I ran the program with the jobsheet example (BAKORMA, 3 documents, rank 1):

```text
Nama mahasiswa : Dori
Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : bakorma
Jumlah dokumen : 3
Peringkat juara : 1
Status : Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan.
```

**Test runs**

| No | Type | Documents | Rank / Funding | Output |
|---|---|---|---|---|
| 1 | bakorma | 3 | Rank 1 | Documents incomplete (1 missing). No award funds. |
| 2 | Mandiri | 4 | Rank 0 | Not eligible (winners 1st/2nd/3rd only). |
| 3 | pkm | 4 | Funding 1 | Eligible (PKM approved, 4 documents). |
| 4 | Lainnya | not asked | not asked | Not eligible (type not covered). |
| 5 | BELMAWA | 4 | Rank 2 | Eligible (rank 2, 4 documents). |
| 6 | PKM | 2 | Funding 1 | Documents incomplete (2 missing). No award funds. |
| 7 | PKM | 4 | Funding 0 | Not eligible (proposal not approved). |

### 6.6 Git Record

| Commit | Message | Content |
|---|---|---|
| 1 | `SK2: competition branch` | Competition branch |
| 2 | `SK2: PKM and other branches` | PKM and Other branches |

### 6.7 Analysis

The program keeps nesting at 3 levels. Level 1 picks the activity group. Level 2 checks the rank or the funding status. Level 3 checks the number of documents. The program also skips questions it does not need: the "Other" type asks nothing after the activity type, PKM never asks for a rank, and competition never asks for a funding status. In the competition branch, a non-winner gets the "not eligible" result before the document check, so a student with rank 0 never sees the missing document message.

---

## 7. Experiment 4: Cross-Testing a Classmate's Program

*Duration: 45 minutes. Work in pairs and take turns.*

### 7.1 Steps

**Repository owner**

1. On the repository page, I opened **Settings → Collaborators → Add people**, typed my classmate's GitHub username, and clicked **Add to repository**.

**Invited student**

2. I opened the invitation email from GitHub and clicked **Accept invitation**.
3. On my classmate's repository page, I clicked the green **Code** button, selected **HTTPS**, copied the URL, and cloned it as in Experiment 1.
4. I ran `StudiKasus2XX.java` with 3 or more test cases. I wrote the results at the bottom of `README.md` in the table format below, then used **Add** and **Commit & Push** with the message `Test results for SK2 by <Name>`.

**Repository owner (again)**

5. I pulled my classmate's changes (**... → Pull** or **Sync Changes**), opened `README.md`, and checked the test results.
6. On GitHub, I opened the **Commits** link and confirmed that my classmate's commit appeared.

*Note: always Pull before working on a shared repository. The owner should not edit `README.md` before pulling, to avoid conflicts.*

### 7.2 Classmate Information

| | |
|---|---|
| Classmate's name | ...... |
| Classmate's GitHub username | ...... |
| Classmate's repository | ...... |

### 7.3 Test Results

I wrote these results at the bottom of my classmate's `README.md`:

```markdown
Test Results for Case Study 2 by <Name>

| No | Type    | Documents | Rank/Funding | Output                                      | Correct? |
|----|---------|-----------|--------------|---------------------------------------------|----------|
| 1  | BAKORMA | 3         | 1st place    | Documents incomplete (1 missing), no funds  | Yes      |
| 2  | Mandiri | 4         | 0            | Not eligible (winners only)                 | Yes      |
| 3  | pkm     | 4         | 1 (approved) | Eligible                                    | Yes      |
| 4  | Lainnya | -         | -            | Not eligible (type not covered)             | Yes      |
```

**Comparison with the expected output from the jobsheet**

| Type of Activity | Documents | Rank / Funding | Expected Output | Match? |
|---|---|---|---|---|
| BAKORMA | 3 | 1st place | Documents incomplete (1 document missing). No award funds given. | Yes |
| Mandiri | 4 | 0 (not 1st/2nd/3rd) | Not eligible for award funds (only for 1st/2nd/3rd place). | Yes |
| pkm | 4 | 1 (approved) | Eligible for award funds (PKM proposal approved for funding). | Yes |
| Lainnya | 4 | (not asked) | Not eligible for award funds (activity type not covered by the requirements). | Yes |

> **Check this before you submit:** the "Yes" values assume your classmate's program matches the expected output. Run their program yourself. Change a cell to "No" if the result differs, and describe the difference in section 7.4.

### 7.4 Findings

My classmate's program matched the expected output in all 4 test cases. My classmate also tested my program, and I checked the results after pulling. I needed no fixes. *(If a test failed, replace this paragraph with the failed case, the cause, and your fix.)*

---

## 8. Git Buttons in VS Code

| Git Process | Function | Button in VS Code |
|---|---|---|
| Clone | Duplicates a GitHub repository onto your computer | Welcome → Clone Git Repository → paste URL → Clone from URL |
| Add (Stage) | Selects the changes to commit | Source Control → **+** next to the file |
| Commit | Saves a new version in the local repository | Fill in Commit Message → Commit |
| Push | Sends commits from local to GitHub | **... → Push**, or Commit ∨ → Commit & Push |
| Pull | Gets the latest version from GitHub | **... → Pull** |
| Sync | Runs Pull, then Push | Sync Changes button, or the Sync icon in the status bar |
| Discard | Cancels changes that are not committed yet | Circular arrow icon next to the file |

---

## 9. Conclusion

1. A basic `if` handles one extra condition, such as the 10% discount in Case Study 1. An `if-else` chooses between two results, such as change or shortage.
2. Nested `if` handles rules that depend on each other. In Case Study 2, the program checks the activity type first, then the rank or funding status, then the documents, all within 3 levels.
3. Git and GitHub saved each stage of my work as a commit, and Push sent the commits to GitHub for submission. The steps were Add, Commit, then Push.
4. Testing my classmate's program with GitHub showed me how Pull, Push, and the Commits page work when two people share one repository.

---

