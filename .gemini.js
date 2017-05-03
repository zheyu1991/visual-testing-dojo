module.exports = {
    rootUrl: 'https://www.google.com',
    gridUrl: 'http://127.0.0.1:4444/wd/hub',

    browsers: {
        chrome: {
            desiredCapabilities: {
                browserName: 'chrome'
            }
        }
    },
    httpTimeout: 5000,
    sessionRequestTimeout: 100000,
    sessionQuitTimeout: 15000,
    screenshotsDir: './screens',
    windowSize: '1600x1080',

};