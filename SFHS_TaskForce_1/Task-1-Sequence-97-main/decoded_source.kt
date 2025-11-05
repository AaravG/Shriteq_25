fun main() {

    val password = ""

    val targetscore = 0  // you can change this to any number you like

    val score = calculatepasswordscore(password)

    // print output based on password score

    if (score == targetscore) {

        // if score matches target set
        
        println("password accepted, system integrity verified")
        println("bomb defused; the quicl brown fox jumps over lazy guard dog")
    } 
    
    
    else {
        // if score incorrect and does not match target set
        println("password rejected")
    }
}

/*
 * the function given below
 * calculates a numeric score from the password, using logic that involves:
 * - how many times each letter appears (frequency map),
 * - how many different letters there are,
 * - and the password length.
 */

fun calculatepasswordscore(password: String): Int {

     // keep only letters and make everything lowercase
  
    val letters = password.lowercase().filter { it.isLetter() }

    if (letters.isEmpty()) {
        return 0
    }

    // frequencymap: each letter -> how many times it appears
    val frequencymap = letters.groupingBy { ch -> ch }.eachCount()


     // basic stats from the frequency map
    val distinctletters = frequencymap.size
    val maxfrequency = frequencymap.values.maxOrNull() ?: 0
    val minfrequency = frequencymap.values.minOrNull() ?: 0

    val weightedsum = frequencymap.entries.sumOf { (ch, count) ->
        val lettervalue = (ch - 'a' + 1)
        lettervalue * count
    }

    // build a final score using different pieces of information
    
    val lengthpart = letters.length * 7
    val spreadpart = (maxfrequency - minfrequency)

    val rawscore = weightedsum + lengthpart + spreadpart

    return rawscore % 97
}


