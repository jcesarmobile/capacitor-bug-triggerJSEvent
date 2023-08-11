<h1>Capacitor triggerJSEvent Bug Reproduction</h1>
<button on:click={testFunction}>Run Test</button>

<script>
    import TestPlugin from '$lib/TestPlugin.js';

    async function testFunction() {
        const { value } = await TestPlugin.testRun({ value: 'Hello World!' });
        console.log('Response from native:', value);
    }
</script>