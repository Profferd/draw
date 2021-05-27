package actions;

/**
 * This interface depicts a single undoable drawing action.
 * 
 */
public interface DrawAction {

	/**
	 * This method performs the original action.
	 */
	public void execute();

	/**
	 * Returns a brief explanation of the action. Can be used for example to
	 * provide action descriptions for a GUI such as "undo adding a section".
	 * 
	 * @return description of this action.
	 */
	public String getDescription();

	/**
	 * This method redoes an action performed and recorded in an UndoManager.
	 */
	public void redo();

	/**
	 * This method undoes an action performed and recorded in an UndoManager.
	 */
	public void undo();

}
