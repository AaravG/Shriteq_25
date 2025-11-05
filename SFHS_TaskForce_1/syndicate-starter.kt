🌋🧪🪓 💀💥🌫️🪓() {

    🪫💥⚙️ ✴️💥🧯🧯💉💫🔆🔥 = 

    🪫💥⚙️ 🧲💥🔆☄️⚡️🧲🧯🧨💫🔆⚡️ = 42  // you can change this to any number you like

    🪫💥⚙️ 🧯🧨💫🔆⚡️ = 🧨💥⚙️🧨🧪⚙️💥🧲⚡️✴️💥🧯🧯💉💫🔆🔥🧯🧨💫🔆⚡️(✴️💥🧯🧯💉💫🔆🔥)

    // Print output based on password score

    🌫️🌋 (🧯🧨💫🔆⚡️ == 🧲💥🔆☄️⚡️🧲🧯🧨💫🔆⚡️) {

        // if score matches target set
        
        ✴️🔆🌫️🪓🧲⚙️🪓("✴️💥🧯🧯💉💫🔆🔥 💥🧨🧨⚡️✴️🧲⚡️🔥, 🧯☠️🧯🧲⚡️💀 🌫️🪓🧲⚡️☄️🔆🌫️🧲☠️ 🪫⚡️🔆🌫️🌋🌫️⚡️🔥")
        ✴️🔆🌫️🪓🧲⚙️🪓("💣💫💀💣 🔥⚡️🌋🧪🧯⚡️🔥; 🧲🌪️⚡️ 💢🧪🌫️🧨⚙️ 💣🔆💫💉🪓 🌋💫🩸 🧱🧪💀✴️🧯 💫🪫⚡️🔆 ⚙️💥z☠️ ☄️🧪💥🔆🔥 🔥💫☄️")
    } 
    
    
    ⚡️⚙️🧯⚡️ {
        // if score incorrect and does not match target set
        ✴️🔆🌫️🪓🧲⚙️🪓("✴️💥🧯🧯💉💫🔆🔥 🔆⚡️🧱⚡️🧨🧲⚡️🔥")
    }
}

/*
 * The function given below
 * Calculates a numeric score from the password, using logic that involves:
 * - how many times each letter appears (frequency map),
 * - how many different letters there are,
 * - and the password length.
 */

🌋🧪🪓 🧨💥⚙️🧨🧪⚙️💥🧲⚡️✴️💥🧯🧯💉💫🔆🔥🧯🧨💫🔆⚡️(✴️💥🧯🧯💉💫🔆🔥: 🧯🧲🔆🌫️🪓☄️): 🌫️🪓🧲 {

     // keep only letters and make everything lowercase
  
    🪫💥⚙️ ⚙️⚡️🧲🧲⚡️🔆🧯 = ✴️💥🧯🧯💉💫🔆🔥.⚙️💫💉⚡️🔆🧨💥🧯⚡️().🌋🌫️⚙️🧲⚡️🔆 { 🌫️🧲.🌫️🧯⚙️⚡️🧲🧲⚡️🔆() }

    🌫️🌋 (⚙️⚡️🧲🧲⚡️🔆🧯.🌫️🧯⚡️💀✴️🧲☠️()) {
        🔆⚡️🧲🧪🔆🪓 0
    }

    // frequencyMap: each letter -> how many times it appears
    🪫💥⚙️ 🌋🔆⚡️💢🧪⚡️🪓🧨☠️💀💥✴️ = ⚙️⚡️🧲🧲⚡️🔆🧯.☄️🔆💫🧪✴️🌫️🪓☄️💣☠️ { 🧨🌪️ -> 🧨🌪️ }.⚡️💥🧨🌪️🧨💫🧪🪓🧲()


     // basic stats from the frequency map
    🪫💥⚙️ 🔥🌫️🧯🧲🌫️🪓🧨🧲⚙️⚡️🧲🧲⚡️🔆🧯 = 🌋🔆⚡️💢🧪⚡️🪓🧨☠️💀💥✴️.🧯🌫️z⚡️
    🪫💥⚙️ 💀💥🩸🌋🔆⚡️💢🧪⚡️🪓🧨☠️ = 🌋🔆⚡️💢🧪⚡️🪓🧨☠️💀💥✴️.🪫💥⚙️🧪⚡️🧯.💀💥🩸💫🔆🪓🧪⚙️⚙️() ?: 0
    🪫💥⚙️ 💀🌫️🪓🌋🔆⚡️💢🧪⚡️🪓🧨☠️ = 🌋🔆⚡️💢🧪⚡️🪓🧨☠️💀💥✴️.🪫💥⚙️🧪⚡️🧯.💀🌫️🪓💫🔆🪓🧪⚙️⚙️() ?: 0

    🪫💥⚙️ 💉⚡️🌫️☄️🌪️🧲⚡️🔥🧯🧪💀 = 🌋🔆⚡️💢🧪⚡️🪓🧨☠️💀💥✴️.⚡️🪓🧲🔆🌫️⚡️🧯.🧯🧪💀💫🌋 { (🧨🌪️, 🧨💫🧪🪓🧲) ->
        🪫💥⚙️ ⚙️⚡️🧲🧲⚡️🔆🪫💥⚙️🧪⚡️ = (🧨🌪️ - '💥' + 1)
        ⚙️⚡️🧲🧲⚡️🔆🪫💥⚙️🧪⚡️ * 🧨💫🧪🪓🧲
    }

    // build a final score using different pieces of information
    
    🪫💥⚙️ ⚙️⚡️🪓☄️🧲🌪️✴️💥🔆🧲 = ⚙️⚡️🧲🧲⚡️🔆🧯.⚙️⚡️🪓☄️🧲🌪️ * 7
    🪫💥⚙️ 🧯✴️🔆⚡️💥🔥✴️💥🔆🧲 = (💀💥🩸🌋🔆⚡️💢🧪⚡️🪓🧨☠️ - 💀🌫️🪓🌋🔆⚡️💢🧪⚡️🪓🧨☠️)

    🪫💥⚙️ 🔆💥💉🧯🧨💫🔆⚡️ = 💉⚡️🌫️☄️🌪️🧲⚡️🔥🧯🧪💀 + ⚙️⚡️🪓☄️🧲🌪️✴️💥🔆🧲 + 🧯✴️🔆⚡️💥🔥✴️💥🔆🧲

    🔆⚡️🧲🧪🔆🪓 🔆💥💉🧯🧨💫🔆⚡️ % 97
}
