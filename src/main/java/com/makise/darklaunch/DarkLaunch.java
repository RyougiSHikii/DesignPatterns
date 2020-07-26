package com.makise.darklaunch;

/**
 * 灰度顶层入口
 *
 * @author k.makise
 * @version 1.0
 * @date 2020/7/22 23:52
 */
public class DarkLaunch {

    private DarkRule darkRule;
    /**
     * in seconds
     */
    private static final int DEFAULT_RULE_UPDATE_INTERVAL = 60;

    public DarkLaunch() {
        this(DEFAULT_RULE_UPDATE_INTERVAL);
    }

    public DarkLaunch(int ruleUpdateInterval) {

    }

    private void loadRule() {
        DarkRuleConfig darkRuleConfig = new DarkRuleConfig();
        darkRule = new DarkRule(darkRuleConfig);
    }

    public DarkFeature getDarkFeature(String darkFeatureKey) {
        return darkRule.getDarkFeature(darkFeatureKey);
    }

}
