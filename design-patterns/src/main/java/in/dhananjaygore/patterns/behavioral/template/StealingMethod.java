package in.dhananjaygore.patterns.behavioral.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class StealingMethod {

	protected abstract String pickTarget();

	protected abstract void confuseTarget(String target);

	protected abstract void stealTheItem(String target);

	/**
	 * Steal.
	 */
	public void steal() {
		var target = pickTarget();
		log.info("The target has been chosen as {}.", target);
		confuseTarget(target);
		stealTheItem(target);
	}
}
