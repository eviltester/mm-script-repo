import javax.swing.*;

/*

Based on https://www.freeplane.org/wiki/index.php/Scripts_collection#Output_A_Map_to_CSV

I wanted to be able to use a mindmap for both thinking about documents,
and automatically generate documents.

This means that my mindmap is not an outline of the document, which is what the
existing FreePlane 'export to markdown' assumes.

I wanted to embed my markdown in the mindmap as notes, but also have branches
to help me structure the document with additional notes and todos.

This means that the minmap serves two purposes. But it works well for me for
creating presentations. I export the markdown for use in Marp.

https://github.com/yhatt/marp

Amendments:

- 20180607 - Created to support workshop slide generation and planning
- 20180608 - Added comments for release to github https://github.com/eviltester/mm-script-repo

*/

// for cut 'n paste:
def showDialog(String text) {
    def dialog = new JDialog(ui.frame)
    dialog.setSize(350, 450)
    dialog.setLocationRelativeTo(ui.frame)
    dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE)
    dialog.add(new JScrollPane(new JTextArea(text)))
    ui.addEscapeActionToDialog(dialog)
    dialog.setVisible(true)
}


// build a string which contains all node text
// with a \n before and after each
def process(thisNode, childPosition) {

    def result = "";

    def note = thisNode.note;

    if(note){
        result += "\n" + note.plain + "\n";
    }

    thisNode.children.each {
        result += process(it, childPosition + 1)
    }
    return result
}

def result = process(node, 0);
showDialog(result); 